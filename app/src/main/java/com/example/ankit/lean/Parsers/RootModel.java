import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_name;
	public String topic;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String logo;
	public String description;
	public String start_time;
	public String name;
	public String email;
	public String privacy;
	public String schedule_published_on;
	public int id;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String state;
	public String timezone;

	public RootModel(String organizer_description, String end_time, ArrayList<Social_linksModel> social_links, String type, String organizer_name, String topic, CopyrightModel copyright, VersionModel version, String location_name, Call_for_papersModel call_for_papers, String background_image, String logo, String description, String start_time, String name, String email, String privacy, String schedule_published_on, int id, CreatorModel creator, String code_of_conduct, String state, String timezone) {

		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.social_links = social_links;
		this.type = type;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._copyright = copyright;
		this._version = version;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this.name = name;
		this.email = email;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;

	}

}