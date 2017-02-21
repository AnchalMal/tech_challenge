package ravi.model;

public class myJson {
	    private String success;
	    private String accountidentifier;
	    
	    public myJson (String success, String accountidentifier)
	    {
	    	this.success = success;
	    	this.accountidentifier =accountidentifier;
	    }
	    
	    public void myJson (String success, String accountidentifier){
	    
	    }

	    public String getsuccess() {
	        return success;
	    }

	    public void setsuccess(String success) {
	        this.success = success;
	    }

	    public String getaccountidentifier() {
	        return accountidentifier;
	    }

	    public void setaccountidentifier(String accountidentifier) {
	        this.accountidentifier = accountidentifier;
	    }
	}


