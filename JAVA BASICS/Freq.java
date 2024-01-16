/* Frequrncy */

class Mystring2
{
	char[] str=new char[30];
	int len;
	char ch;
	int count;
	public Mystring2()
	{
		int i;
		this.str[0]='a';
		this.str[1]='a';
		this.str[2]='b';
		this.str[3]='c';
		this.str[3]='\0';
		for(i=0;this.str[i]!='\0';i++);
		this.len=i;
		this.count=0;
	}
}

class Frequency
{
	public static void main(String[] args)
	{
		int i;
		Mystring2 s1;
		s1=new Mystring2();
		s1.ch='a';
		for(i=0;i<s1.len;i++)
		{
			if(s1.ch==s1.str[i])
			{
				s1.count++;
			}
		}
	System.out.println("Count="+s1.count);
	}
}
