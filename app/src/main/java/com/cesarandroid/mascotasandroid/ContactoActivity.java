package com.cesarandroid.mascotasandroid;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ContactoActivity extends Activity implements View.OnClickListener {

    Session session = null;
    ProgressDialog progressDialog = null;
    Context context = null;
    EditText nombre;
    EditText correo;
    EditText coment;
    Button enviar;
    String nom;
    String mail;
    String comen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);



        context = this;
        enviar = (Button) findViewById(R.id.Benviar);
        nombre = (EditText)findViewById(R.id.Enombre);
        correo = (EditText)findViewById(R.id.Ecorreo);
        coment = (EditText)findViewById(R.id.Ecomentario);

        enviar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        nom = nombre.getText().toString();
        mail = correo.getText().toString();
        comen = coment.getText().toString();

        Properties properties = new Properties();
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port","465");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.port","465");

        session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("cesarmanrg@gmail.com", "vector1593");
            }
        });

        progressDialog = ProgressDialog.show(context, "", "Sending Mail...", true);
        RetreiveFeedTvask tvask = new RetreiveFeedTvask();
        tvask.execute();
    }

    class RetreiveFeedTvask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("cesarmanrg@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(nom));
                message.setSubject(mail);
                message.setContent(comen, "text/html; charset=uft-8");

                Transport.send(message);

            }catch (AddressException e) {
                e.printStackTrace();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result){

            progressDialog.dismiss();
            nombre.setText("");
            correo.setText("");
            coment.setText("");
            Toast.makeText(getApplicationContext(), "Mensaje Send", Toast.LENGTH_SHORT).show();


        }

    }
}
