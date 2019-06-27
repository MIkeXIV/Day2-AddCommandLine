
public class AddCLIInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for (String num : args)
		{
			int number = Integer.parseInt(num);
			total += number;
		}
		System.out.print(total);
	}

}
