
class CopyrightModel {

	public String holder_url;
	public String licence;
	public String licence_url;
	public int year;
	public String holder;
	public String logo;

	public CopyrightModel(String holder_url, String licence, String licence_url, int year, String holder, String logo) {

		this.holder_url = holder_url;
		this.licence = licence;
		this.licence_url = licence_url;
		this.year = year;
		this.holder = holder;
		this.logo = logo;

	}

}