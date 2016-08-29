import java.util.ArrayList;

class RootModel {

	public String logo;
	public String type;
	public String schedule_published_on;
	public String topic;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String location_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String state;
	public String name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String start_time;
	public String organizer_description;
	public String privacy;
	public String background_image;
	public CreatorModel _creator;
	public int id;
	public String code_of_conduct;
	public String timezone;

	public RootModel(String logo, String type, String schedule_published_on, String topic, String end_time, ArrayList<Social_linksModel> social_links, String email, String location_name, String description, Call_for_papersModel call_for_papers, String organizer_name, String state, String name, CopyrightModel copyright, VersionModel version, String start_time, String organizer_description, String privacy, String background_image, CreatorModel creator, int id, String code_of_conduct, String timezone) {

		this.logo = logo;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.end_time = end_time;
		this.social_links = social_links;
		this.email = email;
		this.location_name = location_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this._copyright = copyright;
		this._version = version;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.background_image = background_image;
		this._creator = creator;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;

	}

}