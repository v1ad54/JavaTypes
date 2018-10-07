import java.math.BigDecimal;

/**
 * ���� ������ Java
 */
public class JavaTypes {

	public static void main(String[] args) {
		// ������������� ���� ������
		// ��������� ���������� �������� ������������� ����� �� ������� �� ������, ��
		// ������� ����������� ���������! � Java ����������� ����������� (unsigned)
		// ������������� ������������� �����.
		byte b; // 1 byte �� -128 �� 127
		short s; // 2 byte �� -32768 �� 32767
		int i; // 4 byte �� -2147483648 �� 2147483647 (�.�. ������ 2 ����.)
		long l; // 8 byte �� -9223372036854775808 �� -9223372036854775807

		// �������� ���� ������ � ��������� ������
		float f; // 4 byte �������������� +/- 3.40282347E+38F (6-7 �������� ���������� ����)
		double d; // 8 byte �������������� +/- 1.7976931348623157E+308F (15 �������� ����������
					// ����)

		// ��� ����� char
		char c;

		// ��� ������ boolean
		boolean bool;

		System.out.println("����� ���� ������");

		// ������� ����� ����� ����������� � �������� L
		l = 4000000000L;
		System.out.println("l = " + l);

		// ��c��������� ����� ������������ � ��������� 0 (����)
		i = 010; // 010 - ��� ���������� ����� 8 � ������������ �����.
					// ����� ������ ������ �������� � ��������������, ������� ������������
					// ������������� ������� �� �������������
		System.out.println("i = " + i);

		// ����� � �������� ����� ����������� � ��������� 0b ��� 0B
		b = 0b1001; // ���������� ����� 9 � �������� ����
		System.out.println("b = " + b);
		// ��� ��������� ��������������� ������� �����, ��� ���������� �������� �����
		// ��������� ������������� (���������� Java ������ �� �������)
		s = 0b111_0100_0010_0000;
		l = 4_000_000_000L;
		System.out.println("s = " + s);
		System.out.println("l = " + l);

		System.out.println("\n���� ������ � ��������� ������");

		// �������� ���� double �������� ����� �������������� ��� ���� float.
		// ������������ ����� float ������� ������������ ���� � �����������, ��� ���
		// ���������� ���������, ��� � ��� ������, ���� ����� �������� ����������
		// ������� � ������� ����������.

		// �������� �������� ���� float ����������� � �������� F
		f = 3.1415926535_8979323846_2643383279F;
		System.out.println("f = " + f);
		// �������� �������� ����������� ��� ������� F ������ ��������������� ���
		// ����������� � ���� double
		System.out.println("float:  " + 3.1415926535_8979323846_2643383279F);
		System.out.println("double: " + 3.1415926535_8979323846_2643383279);
		// ��� ��������� ������������� �������� ���� double ����� (�� �� �����������)
		// ������������ ������ D
		d = 3.1415926535_8979323846_2643383279D;
		System.out.println("d = " + d);

		// �������� �������� � ��������� ������ ����� ���� ������������ �
		// ����������������������.
		// ��������, �������� �������� 0.125 ����� 2 � ������� -3 ����� �������� ���
		// 0x1.0p-3. � ����������������� ����� ��� ��������� ���������� ������� ������
		// ����������� p, �� e, ��������� e - ����������������� �����. �������� ��������
		// �� �� ���, ������� ����� ������������ � ����������������� �����, � ����������
		// ������� - � ����������, ����� ��� ��������� ���������� ������� - 2, �� �� 10.
		System.out.println("0x1.0p-3 = " + 0x1.0p-3);

		// � Java ��� �������� ��� ������� � ��������� ������ ������������ �� ���������
		// IEEE 754. ������� ������� ��� ����������� �������� � ��������� ������:
		// - ������������� �������������
		// - ������������� �������������
		// - �� ����� (NaN)
		// ��������� ������� �������������� ������������� ����� �� 0 ����� �������������
		// �������������
		System.out.println("������������� ����� / 0 = " + (123456789.123456789 / 0));
		// ��������� ������� �������������� ������������� ����� �� 0 ����� �������������
		// �������������
		System.out.println("������������� ����� / 0 = " + (-123456789.123456789 / 0));
		// ��������� ������� 0.0 �� 0 ����� ����������
		System.out.println("(0.0 / 0) = " + (0.0 / 0));
		// � Java ���������� ��������� Double.POSITIVE_INFINITY,
		// Double.NEGATIVE_INFINITY � Double.NaN (� ��� �� ��������������� ���������
		// ���� float). �� ����� ��������� ��� ��������������� ��������� �� �����.
		d = (0.0 / 0);
		// �.�. ��� �������� �� �������� ������� �� ��� ������ �� ���������
		if (d == Double.NaN) { // ������� �� ����� ���������
			System.out.println("1. NaN");
		}
		// ������� ��������� ���
		if (Double.isNaN(d)) { // �������� �������� �� �������� ���������� �� ������
			System.out.println("2. NaN");
		}

		// ����� � ��������� ������ ������ ������������ � ���������� ��������, ���
		// ������ ���������� �� ���������.�������� ��������� (2.0 - 1.1) �����
		// 0.8999999999999999, � �� 0.9, ��� ���� �� ������� ������������. ��� ������
		// ������� � ���������� �������� �������������� �����.
		System.out.println("(2.0 - 1.1) = " + (2.0 - 1.1));
		// ���� ��������� ��������� ������ ����������, �� ������� ���������������
		// ������� BigDecimal
		BigDecimal bd20 = new BigDecimal(2.0D);
		BigDecimal bd11 = new BigDecimal(1.1D);
		System.out.println("BigDecimal: " + bd20.subtract(bd11));

		System.out.println("\n��� ������ boolean");
		bool = true; // ��� false
		if (bool) {
			System.out.println("������.");
		} else {
			System.out.println("���.");
		}

		System.out.println("\n��� ������ char");
		c = 'A';
		System.out.println("������ : " + c);
		// ������� ������� Unicode ����� ���� ������������ ������������������ ������� �
		// �������� �� \u0000 �� \uFFFF
		System.out.println("������ Unicode \\u2122 : " + '\u2122');
		// ����������� ������������������ �������� � Unicode �������������� �����
		// �������������� ������������ ����. ������� ����� ���� ���������� � ��
		// ������������� � ������������. ��������, \u00A0 (���� ����� ������) �������
		// �������������� ������.
		// ����������� (��� ������������ �����):
		// ����� � ������� c:\\users
		// ������� �������������� ������, �.�. user �� �������� ����������������� ������
		// ��� char ����� ��������� ��������� ����������� ��������:
		// \b (� Unicode \\u0008) ������� �� ���� �������
		// \t (\\u0009) ���������
		// \n (\\u000a) ������� �� ����� ������
		// \r (\\u000d) ������� �������
		// \" (\\u0022) ������� �������
		// \' (\\u0027) ��������� �������
		// \\ (\\u005c) �������� ����� �����

	}

}
