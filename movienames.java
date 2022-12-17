import java.util.ArrayList;
import java.util.stream.Stream;


class moviename{
	String moviename;
	String hero;
	String heroine;
	int releaseyear;
	
	
	moviename(String moviename,String hero,String heroine,int releaseyear)
	{
		this.moviename=moviename;
		this.hero=hero;
		this.heroine=heroine;
		this.releaseyear=releaseyear;
	}
}

public class movienames {
	public static void main(String[] args) {
		
		ArrayList<moviename> al=new ArrayList<moviename>();
		al.add(new moviename("sardar","vijay","samantha",2022));
		al.add(new moviename("stalin","chiru","trisha",2020));
		al.add(new moviename("hitler","chiru","ramba",2021));
		al.add(new moviename("tagore","chiru","samantha",2020));
		al.add(new moviename("adi","ntr","keerthi",2022));
		
		al.forEach(l->System.out.println(l.moviename+" "+l.hero+" "+l.heroine+" "+l.releaseyear+" " ));
		System.out.println("------------------filterData-------------");
		
		Stream <moviename> filmdata=al.stream().filter(p->p.releaseyear==2022);
		filmdata.forEach(l->System.out.println(l.moviename+" "+l.hero+" "+l.heroine+" "+l.releaseyear+" "));
		
		
	}

}
