
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String logo;
	public int year;
	public String licence_url;
	public String licence;

	public CopyrightModel(String holder_url, String holder, String logo, int year, String licence_url, String licence) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.logo = logo;
		this.year = year;
		this.licence_url = licence_url;
		this.licence = licence;

	}

}