import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String topic;
	public String type;
	public String name;
	public int id;
	public String background_image;
	public String description;
	public VersionModel _version;
	public String schedule_published_on;
	public String organizer_description;
	public String logo;
	public String code_of_conduct;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String organizer_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public String state;

	public RootModel(String location_name, String topic, String type, String name, int id, String background_image, String description, VersionModel version, String schedule_published_on, String organizer_description, String logo, String code_of_conduct, String email, ArrayList<Social_linksModel> social_links, String timezone, String organizer_name, CreatorModel creator, Call_for_papersModel call_for_papers, String end_time, CopyrightModel copyright, String privacy, String start_time, String state) {

		this.location_name = location_name;
		this.topic = topic;
		this.type = type;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.social_links = social_links;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.state = state;

	}

}