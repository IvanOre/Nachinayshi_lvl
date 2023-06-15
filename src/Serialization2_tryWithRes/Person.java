package Serialization2_tryWithRes;
/**
 * �������� ����� transient ��������� ���� �� �� ����� ��������������� �����-�� ����
 * serialVersionUID ����� �����.�� �������� ��������� ������.
 * �������� ��� ����. ������ 5 ���.��� �������� �������� ����. �������� ����� Person.
 * ������ ������ Person �� ����� ��������� ������ ����� Person.��� ����� � ���������� UID
 * ������ UID ��� 8890959442460228657L. ����� ���� ����� ��������� ������ 9109280069092111715L
 * ���������� ������� ��� ������ ����� � ������� ������.������ ����� ���������� � ����
 * ��� ������ ��� ������� ������.
 * ����� ����������� ������ �����,�� �� ������ ���������������� ��� UID
 * 
 *
 *
 *
 */

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {


    @Serial
    private static final long serialVersionUID = 9109280069092111715L;
    private int id;//����� 0 �� ��� �������� �� ��������� ��� ������ �����.���� transient �����
    private String name;//�� ����� ��������������� transient / ����� null

    private int age;//�������� ����� ���� ������ ��� ������������ UID

    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id + " : " + name;
    }
}

