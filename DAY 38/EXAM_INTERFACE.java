interface Exam
{
    void announcement();
    void  syllabus();
    void examconduct();
    void resultdeclare();
}

interface Quiz extends Exam
{
    void prize();
}

class KBC implements Quiz 
{
   public  void announcement()
    {
      System.out.println("Sony TV Promotes");
    }
     public void syllabus()
    {
      System.out.println("GK");
    }
     public void examconduct()
    {
      System.out.println("Film Studio, Mumbai");
    }
    
     public void resultdeclare()
    {
      System.out.println("Live");
    }
    
    public void prize ()
    {
      System.out.println("Cheque");
    }
}

class  BoardExam implements Exam
{
    public void announcement()
    {
       System.out.println("Online Portal");
    }
    
    public void syllabus()
    {
      System.out.println("As per Board");
    }
    
    public void examconduct()
    {
      System.out.println("School Within City");
    }
    
     public void resultdeclare()
    {
      System.out.println("Online Portal");
    }
}

class BankExam implements Exam
{
    public void announcement()
    {
       System.out.println("Newspaper / job magazine");
    }
    
    public void syllabus()
    {
      System.out.println("Quantative , Reasoning , GK");
    }
    
    public void examconduct()
    {
      System.out.println("Institute Within City");
    }
    
     public void resultdeclare()
    {
      System.out.println("IBPS Online Portal");
    }
}

class Test
{
    public static void main(String...k)
    {
       BoardExam  be  = new  BoardExam();
       be.announcement();
       be.syllabus();
       be. examconduct();
       be.resultdeclare();
       {
         System.out.println("--------------------------------");
       }
       BankExam  ba  = new  BankExam();
       ba.announcement();
       ba.syllabus();
       ba. examconduct();
       ba.resultdeclare();
        {
         System.out.println("--------------------------------");
        }
       
       KBC  kbc  = new  KBC();
       kbc.announcement();
       kbc.syllabus();
       kbc. examconduct();
       kbc.resultdeclare();
       kbc.prize();
       
       }
       }
       
