import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String privacy;
	public String organizer_name;
	public String topic;
	public String start_time;
	public String email;
	public VersionModel _version;
	public String location_name;
	public String description;
	public String end_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String logo;
	public String background_image;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public int id;
	public String timezone;
	public String organizer_description;
	public String schedule_published_on;
	public String type;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CopyrightModel copyright, String privacy, String organizer_name, String topic, String start_time, String email, VersionModel version, String location_name, String description, String end_time, String code_of_conduct, CreatorModel creator, String logo, String background_image, String state, ArrayList<Social_linksModel> social_links, String name, int id, String timezone, String organizer_description, String schedule_published_on, String type, Call_for_papersModel call_for_papers) {

		this._copyright = copyright;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.start_time = start_time;
		this.email = email;
		this._version = version;
		this.location_name = location_name;
		this.description = description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.logo = logo;
		this.background_image = background_image;
		this.state = state;
		this.social_links = social_links;
		this.name = name;
		this.id = id;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._call_for_papers = call_for_papers;

	}

}