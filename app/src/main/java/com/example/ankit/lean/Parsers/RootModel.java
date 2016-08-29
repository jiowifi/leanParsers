import java.util.ArrayList;

class RootModel {

	public String name;
	public String organizer_description;
	public String schedule_published_on;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public String topic;
	public String type;
	public String end_time;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String logo;
	public int id;
	public String location_name;
	public CopyrightModel _copyright;
	public String background_image;
	public CreatorModel _creator;
	public VersionModel _version;
	public String organizer_name;
	public String email;
	public String start_time;

	public RootModel(String name, String organizer_description, String schedule_published_on, String description, String code_of_conduct, String privacy, String topic, String type, String end_time, String state, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String timezone, String logo, int id, String location_name, CopyrightModel copyright, String background_image, CreatorModel creator, VersionModel version, String organizer_name, String email, String start_time) {

		this.name = name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.topic = topic;
		this.type = type;
		this.end_time = end_time;
		this.state = state;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this._copyright = copyright;
		this.background_image = background_image;
		this._creator = creator;
		this._version = version;
		this.organizer_name = organizer_name;
		this.email = email;
		this.start_time = start_time;

	}

}