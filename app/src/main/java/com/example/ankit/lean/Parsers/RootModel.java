import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String code_of_conduct;
	public String background_image;
	public String description;
	public String email;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public CreatorModel _creator;
	public String topic;
	public CopyrightModel _copyright;
	public String start_time;
	public String state;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String type;
	public String name;
	public String logo;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String timezone, String code_of_conduct, String background_image, String description, String email, VersionModel version, ArrayList<Social_linksModel> social_links, int id, String schedule_published_on, String location_name, CreatorModel creator, String topic, CopyrightModel copyright, String start_time, String state, String organizer_name, String privacy, String end_time, String type, String name, String logo, String organizer_description, Call_for_papersModel call_for_papers) {

		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.description = description;
		this.email = email;
		this._version = version;
		this.social_links = social_links;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._creator = creator;
		this.topic = topic;
		this._copyright = copyright;
		this.start_time = start_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.type = type;
		this.name = name;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;

	}

}