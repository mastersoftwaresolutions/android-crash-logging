package com.test.crashlockup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Activity - That appears when your application crashes.
 * 
 * @author
 * 
 */
public class CrashActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.crash_activity);
		
		final TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText("Sorry, Something went wrong. \nPlease send error logs to developer.");
		
		findViewById(R.id.btnerror).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				
				
			}
		});
		
	}
	
	/**
	 * This list a set of application which can send email. Here user have to
	 * pick one apps via email will be send to developer email id.
	 * 
	 * @param _context
	 * @param filePath
	 */
	// @SuppressLint("NewApi")
	// private void sendErrorMail(Context mContext) {
	//
	// Properties props = new Properties();
	// props.put("mail.smtp.host", "smtp.gmail.com");
	// props.put("mail.smtp.socketFactory.port", "465");
	// props.put("mail.smtp.socketFactory.class",
	// "javax.net.ssl.SSLSocketFactory");
	// props.put("mail.smtp.auth", "true");
	// props.put("mail.smtp.port", "465");
	//
	// Session session = Session.getDefaultInstance(props, new
	// javax.mail.Authenticator() {
	// protected PasswordAuthentication getPasswordAuthentication() {
	// return new PasswordAuthentication("siddharthkhindri@gmail.com",
	// "sid_hawk");
	// }
	//
	// });
	//
	// try {
	// Message message = new MimeMessage(session);
	// message.setFrom(new InternetAddress("siddharthkhindri@gmail.com"));
	// message.setRecipients(Message.RecipientType.TO,
	// InternetAddress.parse("mastersoftwaresolutions@gmail.com"));
	// message.setSubject("Error Description");
	// message.setContent(MessageIs, "text/html; charset=utf-8");
	// // To ByPass MainNetworkThreadException
	// StrictMode.ThreadPolicy policy = new
	// StrictMode.ThreadPolicy.Builder().permitAll().build();
	// StrictMode.setThreadPolicy(policy);
	//
	// Transport.send(message);
	//
	// } catch (MessagingException e) {
	// throw new RuntimeException(e);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
}
