import java.util.ArrayList;

class RootModel {

	public String state;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String location_name;
	public String start_time;
	public String end_time;
	public String logo;
	public VersionModel _version;
	public String type;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_name;
	public String email;
	public String topic;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String background_image;
	public int id;

	public RootModel(String state, String description, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, String name, Call_for_papersModel call_for_papers, String code_of_conduct, String location_name, String start_time, String end_time, String logo, VersionModel version, String type, String privacy, CreatorModel creator, String organizer_name, String email, String topic, String schedule_published_on, CopyrightModel copyright, String background_image, int id) {

		this.state = state;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.logo = logo;
		this._version = version;
		this.type = type;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.email = email;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.background_image = background_image;
		this.id = id;

	}

}