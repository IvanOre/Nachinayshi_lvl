package ENUM_Perechisleniya;

public enum Animal {
    // �� �� �������� ���� ����������� � ������ ������� ��� �������� ������� ������� ������� �� �������
    //������������ new DOG("������")
    DOG("������"),CAT("�����"),FROG("�������");

    private String translation;

    Animal(String translation){// ��� �������� ������������ � ��� ��������� �������� ����������� �� ���������
    this.translation = translation;

    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){// �������������� ��������
        return "������� �� ������� ����: " + translation;

    }
}
