import java.util.ArrayList;

class RootModel {

	public String logo;
	public String privacy;
	public String description;
	public String code_of_conduct;
	public String end_time;
	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;
	public String type;
	public CopyrightModel _copyright;
	public String background_image;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String topic;
	public VersionModel _version;
	public String name;
	public String state;
	public String timezone;
	public String location_name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public int id;

	public RootModel(String logo, String privacy, String description, String code_of_conduct, String end_time, String organizer_description, CreatorModel creator, String start_time, String type, CopyrightModel copyright, String background_image, String email, ArrayList<Social_linksModel> social_links, String organizer_name, String topic, VersionModel version, String name, String state, String timezone, String location_name, String schedule_published_on, Call_for_papersModel call_for_papers, int id) {

		this.logo = logo;
		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;
		this.type = type;
		this._copyright = copyright;
		this.background_image = background_image;
		this.email = email;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._version = version;
		this.name = name;
		this.state = state;
		this.timezone = timezone;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.id = id;

	}

}