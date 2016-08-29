import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public VersionModel _version;
	public String timezone;
	public String background_image;
	public String start_time;
	public String state;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CopyrightModel _copyright;
	public String email;
	public String organizer_name;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public String organizer_description;
	public int id;
	public String logo;
	public String topic;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String description, String location_name, VersionModel version, String timezone, String background_image, String start_time, String state, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, CopyrightModel copyright, String email, String organizer_name, String schedule_published_on, String code_of_conduct, String name, String organizer_description, int id, String logo, String topic, String privacy, String type, Call_for_papersModel call_for_papers) {

		this.description = description;
		this.location_name = location_name;
		this._version = version;
		this.timezone = timezone;
		this.background_image = background_image;
		this.start_time = start_time;
		this.state = state;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this._copyright = copyright;
		this.email = email;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;

	}

}