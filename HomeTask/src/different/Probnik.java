package different;
class Probnik {
	//Probnik probnik=new Probnik();
	int i=0;
	int t=3;
	private static int j=0;
	private static int ars(int y) {
		class Clazz{				//create Local class
			static final int y=0;
			
		}
		return 4;
	}
	//class D
	static class D{
		Probnik.D d=new Probnik.D();
		//D d=new D();
		static int t=9;
		static void ads(){
			System.out.println(j);
			System.out.println(ars(j));
			System.out.println(ars(t));
		}
		int g(){
			//class Here{class There{}}
			return 4;
		}
	}
	//class C
	class C{
		//C c=new C();
		Probnik.C c=new Probnik.C();
		
		int t=7;
		int qw(int x){
			System.out.println(this.t);
			//System.out.println(g());
			return 2;
		}
		void sec(int z){
			System.out.println(c.qw(t));
		}
	}
	
}
