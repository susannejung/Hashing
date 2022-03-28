package FilEksempler;

import java.util.ArrayList;

public class Main {

    public static <antal> void main(String[] args) {
	// write your code here
        final int antal=20;
        TabelRaekke [] hashTabel=new TabelRaekke[antal];
        for(int i=0;i<antal;i++)
            hashTabel[i]=new TabelRaekke();

        Integer tal;
        int index;
        int hashcode;
        for(int i=0;i<100;i++)
        {
            tal=(int)(Math.random()*100);
            hashcode=tal.hashCode();
            index=hashcode%antal;
            System.out.println(tal+" "+tal.hashCode()+" "+index);
            hashTabel[index].raekke.add(tal);
        }

        for(int i=0;i<antal;i++)
        {
            if(hashTabel[i].raekke.size()>0){
                for(int j=0;j<hashTabel[i].raekke.size();j++)
                    System.out.print(hashTabel[i].raekke.get(j)+"  ");
            }
            System.out.println();

        }

        Student[] tabel1 = new Student[6];
        tabel1[0] = (new Student(1, "Bent", 17));
        tabel1[1] = (new Student(2, "Anne", 20));
        tabel1[2] = (new Student(3, "Anna", 20));
        tabel1[3] = (new Student(4, "Peter", 22));
        tabel1[4] = (new Student(5, "Jens", 25));
        tabel1[5] = (new Student(6, "Bodil", 22));


        TabelRaekke<Student> [] hashTabel1=new TabelRaekke[3];
        for(int i=0;i<3;i++)
            hashTabel1[i]=new TabelRaekke<Student>();


        for(int i=0;i<6;i++){
           hashcode=tabel1[i].hashCode();
           index=hashcode%3;
            System.out.println(index+" "+hashcode+" "+tabel1[i].toString());
           hashTabel1[index].raekke.add(tabel1[i]);
        }


       for(int i=0;i<3;i++)
        {
            if(hashTabel1[i].raekke.size()>0){
                for(int j=0;j<hashTabel1[i].raekke.size();j++)
                    System.out.print(hashTabel1[i].raekke.get(j).toString()+"  ");
            }
            System.out.println();

        }

    }
}
