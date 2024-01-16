class Mystring
{
	 char[] str=new char[30];
	protected int len;
	int palindrome;
	public Mystring()
	{
		int i;
		this.str[0]='a';
		this.str[1]='b';
		this.str[2]='a';
		this.str[3]='\0';
		for(i=0;this.str[i]!='\0';i++);
		this.len=i;
		this.palindrome=1;
	}

}

class Palindrome
{
	public static void main(String[] args)
	{
		int left,right;
		Mystring s1;
		s1=new Mystring();
		left=0;
		right=s1.len-1;
		while(left<right)
		{
			if(s1.str[left]!=s1.str[right])
			{
				s1.palindrome=0;
				break;
			}
			left++;
			right--;
		}
		if(s1.palindrome==1)
			System.out.println("It is palindrome ");
		else
			System.out.println("It is not palindrome ");

	}
}


