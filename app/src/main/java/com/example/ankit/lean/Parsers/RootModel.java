import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_description;
	public String state;
	public String location_name;
	public String name;
	public String logo;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String background_image;
	public String timezone;
	public int id;
	public String email;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String start_time;
	public String topic;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String code_of_conduct, String schedule_published_on, CreatorModel creator, String organizer_description, String state, String location_name, String name, String logo, String type, ArrayList<Social_linksModel> social_links, String description, String background_image, String timezone, int id, String email, CopyrightModel copyright, VersionModel version, String organizer_name, String privacy, String end_time, String start_time, String topic, Call_for_papersModel call_for_papers) {

		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.state = state;
		this.location_name = location_name;
		this.name = name;
		this.logo = logo;
		this.type = type;
		this.social_links = social_links;
		this.description = description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.email = email;
		this._copyright = copyright;
		this._version = version;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.start_time = start_time;
		this.topic = topic;
		this._call_for_papers = call_for_papers;

	}

}