
class CopyrightModel {

	public String licence_url;
	public String holder;
	public String logo;
	public String holder_url;
	public int year;
	public String licence;

	public CopyrightModel(String licence_url, String holder, String logo, String holder_url, int year, String licence) {

		this.licence_url = licence_url;
		this.holder = holder;
		this.logo = logo;
		this.holder_url = holder_url;
		this.year = year;
		this.licence = licence;

	}

}