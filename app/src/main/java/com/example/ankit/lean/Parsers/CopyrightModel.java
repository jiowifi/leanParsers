
class CopyrightModel {

	public String licence_url;
	public int year;
	public String logo;
	public String holder_url;
	public String holder;
	public String licence;

	public CopyrightModel(String licence_url, int year, String logo, String holder_url, String holder, String licence) {

		this.licence_url = licence_url;
		this.year = year;
		this.logo = logo;
		this.holder_url = holder_url;
		this.holder = holder;
		this.licence = licence;

	}

}