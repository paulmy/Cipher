package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.ls.LSOutput;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().hide();
        Intent intent2 = getIntent();
        String key = intent2.getStringExtra("message");
        TextView messageText = (TextView) findViewById(R.id.messageText);
        String m = intent2.getStringExtra("message1");
        TextView messageText1 = (TextView) findViewById(R.id.messageText1);
        String a = intent2.getStringExtra("message2");
        TextView messageText5 = (TextView) findViewById(R.id.messageText5);
        int W = intent2.getIntExtra("message3",0);
        System.out.println("W="+W);
        class goC {
            public void AZ(String m1){
                String a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                m1=m1.toLowerCase();
                char[] a = a1.toCharArray();
                char[] m = new char[m1.length()];
                for(int i=0;i<m1.length();i++){
                    m[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                }
                int lMF=0;
                for (int i = 0; i < m1.length(); i++){
                    if (m[i]=='-' || i==m1.length()-1) lMF++;
                    if (m[i]==' ') lMF+=2;
                }
                char[] mF = new char[lMF];
                int q = 1, i123 = 0, sum=0, z=lMF-1;
                for (int i = m1.length()-1; i >= 0; i--){
                    if(m[i]==' '){
                        sum=0;
                        q=1;
                        mF[z]=m[i];
                        z--;
                    } else {
                        if (m[i]=='-'){
                            q=1;
                            mF[z]=a[sum-1];
                            z--;
                            sum=0;
                        } else {
                            i123 = (m[i] - '0')*q;
                            sum+=i123;
                            q*=10;
                            if (i==0) mF[z]=a[sum-1];
                        }
                    }
                }
                String Nm = new String (mF);
                messageText1.setText(Nm);
            }
            public void A(String m1, String a1){
                if (a1.equals("") || a1.length() != 33) a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                m1=m1.toLowerCase();
                a1=a1.toLowerCase();
                char[] a = a1.toCharArray();
                char[] m = new char[m1.length()];
                char[] mF = new char[m1.length()];
                for(int i=0;i<m1.length();i++){
                    m[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                }
                for (int i = 0; i < m1.length(); i++){
                    if(m[i]==' '){
                        mF[i]=m[i];
                    } else {
                        for (int j = 0; j < 33; j++) {
                            if(m[i]==a[j]) mF[i]=a[32-j];
                        }
                    }
                }
                String Nm = new String (mF);
                messageText1.setText(Nm);
                messageText5.setText(Nm);
            }
            public void C(int s1, String m1){
                String a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя",s12=String.valueOf(s1);
                m1=m1.toLowerCase();
                a1=a1.toLowerCase();
                messageText.setText(s12);
                char[] a = a1.toCharArray();
                char[] m = new char[m1.length()];
                char[] mF = new char[m1.length()];
                for(int i=0;i<m1.length();i++){
                    m[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                }

                for (int i = 0; i < m1.length(); i++){
                    for (int j = 0; j < 33; j++){
                        if(m[i]==' '){
                            mF[i]=m[i];
                        } else {
                            if (m[i]==a[j]) mF[i]=a[(j+s1)%32];
                        }
                    }
                }
                String Nm = new String (mF);
                messageText1.setText(Nm);

                int n=0;
                for (int i = 0; i < m1.length(); i++){
                    if(m[i]==' '){
                        mF[i]=m[i];
                    } else {
                        for (int j = 0; j < 33; j++) {
                            if (m[i] == a[j]) {
                                n = j - s1;
                                if (n < 0) n += 32;
                                mF[i] = a[n];
                            }
                        }
                    }
                }
                String Ndm = new String (mF);
                messageText5.setText(Ndm);
            }
            public void V(String key1, String m1, String a1) {
                if (a1.equals("") || a1.length() != 33) a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                key1=key1.toLowerCase();
                m1=m1.toLowerCase();
                a1=a1.toLowerCase();
                char splitM[] = new char[m1.length()];
                for(int i=0;i<m1.length();i++){
                    splitM[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                }
                char t[][] = new char[34][34];
                char[] splitA;
                splitA = a1.toCharArray();
                int shift=0;
                for (int i=0; i<=33; i++){
                    for (int j=0; j<=33; j++){
                        if(i==0 && j==0) {
                            t[i][j]=' ';
                        } else {
                            shift=(j+i-1)%33;
                            t[i][j]=splitA[shift];
                        }
                    }
                }
                char[] K;
                char splitK[] = new char[m1.length()];
                K = key1.toCharArray();//пререводим наш ключ из Str в Char
                for (int i=0; i<m1.length(); i++){
                    splitK[i]=K[i%key1.length()];//подгоняем ключ
                }
                String Nkey = new String (splitK);
                messageText.setText(Nkey);
                //Шифруем
                char nm[] = new char[m1.length()];
                int n1=0,n2=0,q=0;
                for (int a=0; a<m1.length(); a++) {//перебор сообщения и ключа
                    if (splitM[a]==' ') { //проверка на символы
                        nm[a]=splitM[a];
                        q--;
                    } else {
                        for (int i = 0; i < 33; i++) {
                            if (splitM[a]==splitA[i]) n1=i+1; //поиск буквы в таблице
                        }
                        for (int j = 0; j < 33; j++) {
                            if (splitK[q]==splitA[j]) n2=j; //поиск буквы в таблице
                        }
                        nm[a]=t[n1][n2];
                    }
                    q++;
                }
                String Nm = new String (nm);
                messageText1.setText(Nm);
                //Расшифровываем
                q=0;
                for (int a=0; a<m1.length(); a++) {
                    if (splitM[a]==' ') { //проверка на символы
                        nm[a]=splitM[a];
                        q--;
                    } else {
                        for (int i = 0; i < 33; i++) {
                            if (splitK[q]==splitA[i]) n1=i+1; //поиск буквы в таблице
                        }

                        for (int j = 0; j < 33; j++) {
                            if (splitM[a]==t[n1][j]) {
                                n2=j+1;
                            }  //поиск буквы в таблице}
                        }
                        nm[a]=t[0][n2];
                    }
                    q++;
                }
                String Ndm = new String (nm);
                messageText5.setText(Ndm);
            }
        }

        goC g = new goC();
        switch (W){
            case 1:
                g.V(key,m,a);
                break;
            case 2:
                int Ikey=Integer.parseInt(key.trim());
                g.C(Ikey,m);
                break;
            case 3:
                g.A(m,a);
                break;
            case 4:
                g.AZ(m);
                break;
        }


    }


    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}