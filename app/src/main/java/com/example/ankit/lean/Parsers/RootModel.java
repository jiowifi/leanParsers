import java.util.ArrayList;

class RootModel {

	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String description;
	public String type;
	public String logo;
	public String privacy;
	public String state;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public VersionModel _version;
	public String start_time;
	public String location_name;
	public String timezone;
	public String organizer_description;
	public int id;
	public String topic;
	public String schedule_published_on;
	public String code_of_conduct;
	public String end_time;
	public String email;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String description, String type, String logo, String privacy, String state, CreatorModel creator, String organizer_name, String background_image, VersionModel version, String start_time, String location_name, String timezone, String organizer_description, int id, String topic, String schedule_published_on, String code_of_conduct, String end_time, String email, Call_for_papersModel call_for_papers) {

		this.name = name;
		this.social_links = social_links;
		this._copyright = copyright;
		this.description = description;
		this.type = type;
		this.logo = logo;
		this.privacy = privacy;
		this.state = state;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._version = version;
		this.start_time = start_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.email = email;
		this._call_for_papers = call_for_papers;

	}

}