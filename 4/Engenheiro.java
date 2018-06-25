class Engenheiro
{
    public static void main(String args[])
    {
        Carro c1 = new Carro();
        c1.cor = "vermelho";
        c1.modelo = "logan";
        c1.ano = 2000;
        c1.valor = 8000;
        c1.marca = "renault";

        Carro c2 = new Carro("azul", "logan", 2008, 15000, "renault");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}