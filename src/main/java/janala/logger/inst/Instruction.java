package janala.logger.inst;

import java.io.Serializable;

public abstract class Instruction implements Serializable {
  /**
	 * 
	 */
	
  public int iid;
  public int mid;
  public long tid;

  public abstract void visit(IVisitor visitor);

  public Instruction(long tid, int iid, int mid) {
	this.tid = tid;
    this.iid = iid;
    this.mid = mid;
  }
  public Instruction(int iid, int mid) {
		this.tid = -1;
	    this.iid = iid;
	    this.mid = mid;
	  }
}
