import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String description;
	public VersionModel _version;
	public String start_time;
	public String topic;
	public int id;
	public String background_image;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public String timezone;
	public String location_name;
	public String type;
	public String privacy;
	public String logo;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;

	public RootModel(String code_of_conduct, String description, VersionModel version, String start_time, String topic, int id, String background_image, String email, String name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, String timezone, String location_name, String type, String privacy, String logo, String schedule_published_on, ArrayList<Social_linksModel> social_links, String end_time, CreatorModel creator, String organizer_name, String organizer_description) {

		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this.topic = topic;
		this.id = id;
		this.background_image = background_image;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this.timezone = timezone;
		this.location_name = location_name;
		this.type = type;
		this.privacy = privacy;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;

	}

}