package janala.logger.inst;

public class INVOKESTATIC extends Instruction {
  public String owner;
  public String name;
  public String desc;

  public INVOKESTATIC(long tid, int iid, int mid, String owner, String name, String desc) {
    super(tid, iid, mid);
    this.owner = owner;
    this.name = name;
    this.desc = desc;
  }

  public void visit(IVisitor visitor) {
    visitor.visitINVOKESTATIC(this);
  }

  public INVOKESTATIC(int iid, int mid, String owner, String name, String desc) {
	    super(iid, mid);
	    this.owner = owner;
	    this.name = name;
	    this.desc = desc;
	  }
  
  @Override
  public String toString() {
    return "INVOKESTATIC iid="
        + iid
        + " mid="
        + mid
        + " tid=" + tid
        + " owner="
        + owner
        + " name="
        + name
        + " desc="
        + desc;
  }
}
