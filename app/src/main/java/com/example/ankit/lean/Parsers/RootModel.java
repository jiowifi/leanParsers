import java.util.ArrayList;

class RootModel {

	public String description;
	public String background_image;
	public String logo;
	public String end_time;
	public String organizer_description;
	public String start_time;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_name;
	public String schedule_published_on;
	public String name;
	public String privacy;
	public String topic;
	public String state;
	public String location_name;
	public String email;
	public VersionModel _version;
	public int id;
	public String type;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String description, String background_image, String logo, String end_time, String organizer_description, String start_time, String timezone, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String code_of_conduct, String organizer_name, String schedule_published_on, String name, String privacy, String topic, String state, String location_name, String email, VersionModel version, int id, String type, CreatorModel creator, Call_for_papersModel call_for_papers) {

		this.description = description;
		this.background_image = background_image;
		this.logo = logo;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.timezone = timezone;
		this.social_links = social_links;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.location_name = location_name;
		this.email = email;
		this._version = version;
		this.id = id;
		this.type = type;
		this._creator = creator;
		this._call_for_papers = call_for_papers;

	}

}