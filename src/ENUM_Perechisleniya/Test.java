package ENUM_Perechisleniya;

/**
 * ENUM ����������� ���������.�������
 * ��������� ������ �������� �������.
 * System.out.println(season instanceof Enum);
 * instanceof ��������� ������������
 *
 * System.out.println(season.name()); ���������� ��� enum � ���� ������. �����������,��� ��������������
 *
 *  Animal cat = Animal.valueOf("CAT"); ������ enum �������������� ���� ������
 *   System.out.println(cat.getTranslation()); ��� � ������� �������� ������
 *
 *   Season winter = Season.WINTER;
 *   System.out.println(winter.ordinal()); ���������� ����� enum(��� ������) � ������� ��� ��� ��������
 */
public class Test {
    public static void main(String[] args) {
    //Animal animal = Animal.DOG;//� ���������� animal ����� ���� ���
        //System.out.println(animal);// ������� ��� toString ���������������� �� ���������
   /* switch (animal){
        case DOG -> System.out.println("Its a dog");
        case CAT -> System.out.println("Its a cat");
        case FROG -> System.out.println("Its a frog");
        default -> System.out.println("Its a not animal");
    }*/

  /* Season season = Season.SPRING;// � ���������� season ����� ENUM SPRING
        switch (season){
            case SPRING -> System.out.println("Its warm season");
            case AUTUMN -> System.out.println("Its cold season");
            case SUMMER -> System.out.println("Its hot season");
            case WINTER -> System.out.println("Its frozen season");
            default -> System.out.println("Its anomaly season");
        }
        System.out.println(season.getTemperature());*/

////////////////////////////�������� ������ � ENUM////////////////////////////////////////////////////////////

        //name()
       /* Season season = Season.SPRING;
        Animal animal = Animal.FROG;
        System.out.println(animal.name());// ���������� ��� enum � ���� ������*/

        //valueOf
      /* Animal cat = Animal.valueOf("CAT");//������ enum �������������� ���� ������
        System.out.println(cat.getTranslation());*/

        //ordinal()
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());// ���������� ����� enum(��� ������)





    }
}
