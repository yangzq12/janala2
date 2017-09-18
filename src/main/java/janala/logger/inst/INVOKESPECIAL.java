package janala.logger.inst;

public class INVOKESPECIAL extends Instruction {
  public String owner;
  public String name;
  public String desc;

  public INVOKESPECIAL(long tid, int iid, int mid, String owner, String name, String desc) {
    super(tid,iid, mid);
    this.owner = owner;
    this.name = name;
    this.desc = desc;
  }

  public void visit(IVisitor visitor) {
    visitor.visitINVOKESPECIAL(this);
  }

  public INVOKESPECIAL(int iid, int mid, String owner, String name, String desc) {
	    super(iid, mid);
	    this.owner = owner;
	    this.name = name;
	    this.desc = desc;
	  }

  @Override
  public String toString() {
    return "INVOKESPECIAL iid="
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
