public class SmartTv {

    boolean ligada = false;  //variável que irá guardar o status da smarTv, sendo "Ligada=True" ou "Desligada=False"
    int canal=1; //Variavel que armazena em qual canal a smarTv está no momento!
    int volume=25; // váriavel que armazena o volume da smarTv
    static int novoCanal=(int)0;

    public void trocarCanal(int novoCanal){
        /** Método para indicar diretamente para qual canal  a SmartTv irá
         *@param novoCanal este é o parametro que receberá o canal a qual a smartv irá ser mudado
         */
        canal=novoCanal;
    }
    public void ligar(){ //liga a smartTv
         ligada=true;
     }
    public void desligar() { //Desliga a smartTv
        ligada=false;
    }
    public void aumentarCanal(){ //Aumenta o número do canal da smartTv em +1
        ++canal;
    }
    public void diminuirCanal(){ //Diminui o número do canal da smartTv em -1
        --canal;
    }
    public void aumentarVolume(){ //Aumenta o volume da smartTv em +1
        ++volume;
    }
    public void diminuirVolume(){ //Diminui o volume da smartTv em -1
        --volume;
    }
}