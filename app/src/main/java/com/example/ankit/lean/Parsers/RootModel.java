import java.util.ArrayList;

class RootModel {

	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String end_time;
	public String location_name;
	public String timezone;
	public int id;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String logo;
	public String state;
	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public String organizer_name;
	public String description;
	public String email;
	public String privacy;
	public String background_image;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String start_time, ArrayList<Social_linksModel> social_links, String type, String end_time, String location_name, String timezone, int id, CopyrightModel copyright, String schedule_published_on, String logo, String state, String organizer_description, CreatorModel creator, String name, String organizer_name, String description, String email, String privacy, String background_image, VersionModel version, String code_of_conduct, String topic, Call_for_papersModel call_for_papers) {

		this.start_time = start_time;
		this.social_links = social_links;
		this.type = type;
		this.end_time = end_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.state = state;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.email = email;
		this.privacy = privacy;
		this.background_image = background_image;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._call_for_papers = call_for_papers;

	}

}