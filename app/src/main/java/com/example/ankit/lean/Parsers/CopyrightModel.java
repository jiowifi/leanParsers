
class CopyrightModel {

	public String holder_url;
	public int year;
	public String logo;
	public String licence;
	public String licence_url;
	public String holder;

	public CopyrightModel(String holder_url, int year, String logo, String licence, String licence_url, String holder) {

		this.holder_url = holder_url;
		this.year = year;
		this.logo = logo;
		this.licence = licence;
		this.licence_url = licence_url;
		this.holder = holder;

	}

}