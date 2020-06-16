package tech;

import javax.imageio.IIOException;

public class Child extends Thread{
int stars;
Child(int stars)
{
    super();
	this.stars=stars;
	
}
public void run()
{
	for(int i=0;i<stars;i++)
	{
		System.out.println("*");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}



}

