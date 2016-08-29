import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String state;
	public String end_time;
	public String description;
	public String privacy;
	public String logo;
	public String location_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String type;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public int id;
	public String start_time;
	public String background_image;
	public VersionModel _version;
	public String email;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;

	public RootModel(String timezone, String state, String end_time, String description, String privacy, String logo, String location_name, String code_of_conduct, CreatorModel creator, String type, String name, CopyrightModel copyright, String organizer_description, int id, String start_time, String background_image, VersionModel version, String email, String schedule_published_on, Call_for_papersModel call_for_papers, String topic, ArrayList<Social_linksModel> social_links, String organizer_name) {

		this.timezone = timezone;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.privacy = privacy;
		this.logo = logo;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.type = type;
		this.name = name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.id = id;
		this.start_time = start_time;
		this.background_image = background_image;
		this._version = version;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_name = organizer_name;

	}

}