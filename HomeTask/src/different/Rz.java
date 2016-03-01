package different;

public abstract interface Rz {
static final int t=0;
int t1=0;
public abstract void voice();
int xc();
}


abstract class Rx implements Rz {
	Rz rz;
	Rz go(Rz rz){
		this.rz=null;
		return rz;
	}
	public void voice(){
		System.out.println(" ");
	}
	abstract void lq();
	abstract void ln();
	public int xc() {
		return 0;
		// TODO Auto-generated method stub
		
	}
}


class Rc extends Rx implements Rz{

	public void voice() {
		// TODO Auto-generated method stub
		
	}

	public int xc() {
		return 0;
		// TODO Auto-generated method stub
		
	}

	protected void lq() {
		// TODO Auto-generated method stub
		
	}

	void ln() {
		// TODO Auto-generated method stub
		
	}

	
	
}