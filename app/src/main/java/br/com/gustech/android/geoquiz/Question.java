package br.com.gustech.android.geoquiz;

public class Question {

    private int mQuestaoID;
    private boolean mRespostaCorreta;
    private boolean mRespondida;



    public int getmQuestaoID(){
        return mQuestaoID;
    }

    public void setmQuestaoID(int mQuestaoID){
        this.mQuestaoID=mQuestaoID;
    }

    public boolean mRespostaCorreta() {
        return mRespostaCorreta;
    }

    public void setmRespostaCorreta(boolean mRespostaCorreta) {
        this.mRespostaCorreta = mRespostaCorreta;
    }

    public void setmRespondida(boolean resposta){
        this.mRespondida = resposta;
    }

    public boolean getmRespondida(){
        return mRespondida;
    }

    public Question (int mQuestaoID, boolean mRespostaCorreta, boolean mRespondida){
        this.mQuestaoID=mQuestaoID;
        this.mRespostaCorreta=mRespostaCorreta;
        this.mRespondida=mRespondida;
    }


    public boolean CheckAnswer(int i){


        return true;
    }


}
