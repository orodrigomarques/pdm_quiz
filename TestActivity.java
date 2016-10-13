package br.com.fatecpg.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestActivity extends AppCompatActivity {


    private ArrayList<Question> questions = new ArrayList<>(30);
    private ArrayList<String> userAnswers = new ArrayList<>();
    private int position = 0;
    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        t=  getIntent().getIntExtra("",0);
        createTest();
        clearAnswers();
        refreshQuestion();



    }

    private void createTest(){

            //q1
            Question q = new Question();
            q.question = "(CESPE – 2014)Os antivírus são ferramentas capazes de detectar e remover os códigos maliciosos de um computador, como vírus e worms. Tanto os vírus quanto os worms são capazes de se propagarem automaticamente por meio da inclusão de cópias de si mesmo em outros programas, modificando-os e tornando-se parte deles.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q2
            q = new Question();
            q.question = "(CESPE – 2014)Um dos objetivos da segurança da informação é manter a integridade dos dados, evitando-se que eles sejam apagados ou alterados sem autorização de seu proprietário.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q3
            q = new Question();
            q.question = "(CESPE – 2014)A ativação do firewall do Windows impede que emails com arquivos anexos infectados com vírus sejam abertos na máquina do usuário.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q4
            q = new Question();
            q.question = "(CESPE – 2014) Os vírus de computador podem apagar arquivos criados pelo editor de texto, no entanto são incapazes de infectar partes do sistema operacional, já que os arquivos desse sistema são protegidos contra vírus.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q5
            q = new Question();
            q.question = "(CESPE – 2014) Quando ativado na máquina, a principal característica do vírus time bomb é a sua capacidade de remover o conteúdo do disco rígido em menos de uma hora.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q6
            q = new Question();
            q.question = "(CESPE – 2014) A definição e a execução de procedimentos regulares e periódicos de becape dos dados de um computador garante a disponibilidade desses dados após eventuais ocorrências de desastres relacionados a defeitos tanto de hardware quanto de software.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q7
            q = new Question();
            q.question = "(CESPE – 2014) Os antivírus, além da sua finalidade de detectar e exterminar vírus de computadores, algumas vezes podem ser usados no combate a spywares.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q8
            q = new Question();
            q.question = "(CESPE – 2014) O computador utilizado pelo usuário que acessa salas de bate-papo não está vulnerável à infecção por worms, visto que esse tipo de ameaça não se propaga por meio de programas de chat.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q9
            q = new Question();
            q.question = "(CESPE – 2014) O comprometimento do desempenho de uma rede local de computadores pode ser consequência da infecção por um worm.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q10
            q = new Question();
            q.question = "(CESPE – 2014) Em ambientes corporativos, um dos procedimentos de segurança adotado é o monitoramento de acessos dos empregados à Internet, cujo objetivo é permitir que apenas os sítios de interesse da organização sejam acessados.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q11
            q = new Question();
            q.question = "(CESPE – 2014) Quando um documento assinado digitalmente sofre algum tipo de alteração, automaticamente a assinatura digital vinculada ao documento torna-se inválida.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q12
            q = new Question();
            q.question = "(CESPE – 2013) Manter arquivos importantes armazenados em diretórios fisicamente distintos é um hábito que garante a recuperação dos dados em caso de sinistro.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q13
            q = new Question();
            q.question = "(CESPE – 2013) O fator de segurança da biometria é menor que o fator de segurança de outras soluções de identificação, como, por exemplo, o uso de cartões e de senhas.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q14
            q = new Question();
            q.question = "(CESPE – 2013) O fator de segurança da biometria é menor que o fator de segurança de outras soluções de identificação, como, por exemplo, o uso de cartões e de senhas.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q15
            q = new Question();
            q.question = "(CESPE – 2013) A transferência de arquivos para pendrives constitui uma forma segura de se realizar becape, uma vez que esses equipamentos não são suscetíveis a malwares.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q16
            q = new Question();
            q.question = "(CESPE – 2013) O uso de assinatura digital tem maior potencial de garantia de não repúdio que segurança de sigilo sobre determinada informação digital.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q17
            q = new Question();
            q.question = "(CESPE – 2013) Os protocolos TLS (Transport Layer Security) e SSL (Secure Sockets Layer) possuem propriedades criptográficas que permitem assegurar a confidencialidade e a integridade da comunicação.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q18
            q = new Question();
            q.question = "(CESPE – 2013) A compactação de arquivos evita a contaminação desses arquivos por vírus, worms e pragas virtuais.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
        //q19
            q = new Question();
            q.question = "(CESPE – 2013) A criptografia, mecanismo de segurança auxiliar na preservação da confidencialidade de um documento, transforma, por meio de uma chave de codificação, o texto que se pretende proteger.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q20
            q = new Question();
            q.question = "(CESPE – 2013) O gerenciamento das chaves criptográficas tem grande influência sobre o uso adequado de procedimentos de criptografia, como ocorre no caso da criptografia assimétrica, que depende da preservação do estrito sigilo das chaves criptográficas privadas.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q21
            q = new Question();
            q.question = "(CESPE – 2013) Um computador em uso na Internet é vulnerável ao ataque de vírus, razão por que a instalação e a constante atualização de antivírus são de fundamental importância para se evitar contaminações.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q22
            q = new Question();
            q.question = "(CESPE – 2013) Se uma estação com firewall habilitado receber solicitação de conexão do tipo TCP, a conexão será automaticamente negada, porque, comumente, o protocolo TCP transporta vírus.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q23
            q = new Question();
            q.question = "(CESPE – 2013) Autenticidade é um critério de segurança para a garantia do reconhecimento da identidade do usuário que envia e recebe uma informação por meio de recursos computacionais.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q24
            q = new Question();
            q.question = "(CESPE – 2013) A contaminação por pragas virtuais ocorre exclusivamente quando o computador está conectado à Internet.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q25
            q = new Question();
            q.question = "(CESPE – 2013) Malwares propagam-se por meio de rede local, discos removíveis, correio eletrônico e Internet.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q26
            q = new Question();
            q.question = "(CESPE – 2013) A implantação de controle de acesso a dados eletrônicos e a programas de computador é insuficiente para garantir o sigilo de informações de uma corporação.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q27
            q = new Question();
            q.question = "(CESPE – 2012) A rede privada virtual (VPN) do tipo site-to-site constitui-se, entre outros elementos, de um canal de comunicação criptografado entre dois gateways de rede.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q28
            q = new Question();
            q.question = "(CESPE – 2012) Um arquivo do tipo PDF não carrega código malicioso, como cavalo de troia.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //q29
            q = new Question();
            q.question = "(CESPE – 2012) Um arquivo do tipo PDF não carrega código malicioso, como cavalo de troia.";
            q.answer = "ERRADO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);
            //30
            q = new Question();
            q.question = "(CESPE – 2012) Um firewall serve, basicamente, para filtrar os pacotes que entram e(ou) saem de um computador e para verificar se o tráfego é permitido ou não.";
            q.answer = "CERTO";
            q.options = new String[]{"CERTO", "ERRADO"};
            questions.add(q);

            Collections.shuffle(questions);

        }

    private void clearAnswers(){
        for(Question question: questions){
            userAnswers.add("");
        }
    }

    private void refreshQuestion() {

            List<Question> teste = questions.subList(0,t);
            Question q = teste.get(position);
            TextView posTextView = (TextView) findViewById(R.id.positionTextView);
            posTextView.setText((position + 1) + " de " + teste.size());
            TextView qTextView = (TextView) findViewById(R.id.questionTextView);
            qTextView.setText(q.question);
            RadioButton opt1 = (RadioButton) findViewById(R.id.option1Radio);
            opt1.setText(q.options[0]);
            RadioButton opt2 = (RadioButton) findViewById(R.id.option2Radio);
            opt2.setText(q.options[1]);
//            RadioButton opt3 = (RadioButton) findViewById(R.id.option3Radio);
//            opt3.setText(q.options[2]);
            RadioGroup group = (RadioGroup) findViewById(R.id.optionGroup);
            group.check(0);
            if (userAnswers.get(position).equals(opt1.getText()))
                group.check(R.id.option1Radio);
            else if (userAnswers.get(position).equals(opt2.getText()))
                group.check(R.id.option2Radio);
//            else if (userAnswers.get(position).equals(opt3.getText()))
//                group.check(R.id.option3Radio);

    }


    public void back(View view){

        if(position>0) {
            position--;
            refreshQuestion();
        }
    }

    public void next(View view){
        if(position<questions.size()-1) {
            position++;
            refreshQuestion();
        }else {
            Toast.makeText(getApplicationContext(),"Fim do Questionário", Toast.LENGTH_LONG).show();
        }
    }

    public void optionSelection(View view){
        RadioButton opt = (RadioButton)findViewById(view.getId());
        userAnswers.set(position, opt.getText().toString());
    }

    public void finish(View view){
        int sum = 0;
        for(int i=0; i<questions.size(); i++){
            if(questions.get(i).answer.equals(userAnswers.get(i))){
                sum++;
            }
        }
        double result = 100.0 * (double)sum / (double)questions.size();
        Intent i = new Intent(getApplicationContext(), ResultActivity.class);
        i.putExtra("result", result);
        startActivity(i);
        finish();
    }
}
