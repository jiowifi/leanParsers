import java.util.ArrayList;

class RootModel {

	public String email;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public String description;
	public String logo;
	public String code_of_conduct;
	public String end_time;
	public String name;
	public int id;
	public CreatorModel _creator;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String state;
	public VersionModel _version;
	public String location_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String email, String background_image, String organizer_description, String start_time, String organizer_name, String schedule_published_on, String type, CopyrightModel copyright, String description, String logo, String code_of_conduct, String end_time, String name, int id, CreatorModel creator, String topic, ArrayList<Social_linksModel> social_links, String timezone, String state, VersionModel version, String location_name, String privacy, Call_for_papersModel call_for_papers) {

		this.email = email;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this.description = description;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.name = name;
		this.id = id;
		this._creator = creator;
		this.topic = topic;
		this.social_links = social_links;
		this.timezone = timezone;
		this.state = state;
		this._version = version;
		this.location_name = location_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;

	}

}