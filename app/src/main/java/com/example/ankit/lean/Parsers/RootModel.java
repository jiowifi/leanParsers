import java.util.ArrayList;

class RootModel {

	public String name;
	public String end_time;
	public int id;
	public String background_image;
	public String schedule_published_on;
	public String timezone;
	public String email;
	public String privacy;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public String state;
	public String description;
	public String logo;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String start_time;
	public VersionModel _version;

	public RootModel(String name, String end_time, int id, String background_image, String schedule_published_on, String timezone, String email, String privacy, String code_of_conduct, CreatorModel creator, String topic, CopyrightModel copyright, String location_name, String state, String description, String logo, String type, ArrayList<Social_linksModel> social_links, String organizer_description, Call_for_papersModel call_for_papers, String organizer_name, String start_time, VersionModel version) {

		this.name = name;
		this.end_time = end_time;
		this.id = id;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.email = email;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.state = state;
		this.description = description;
		this.logo = logo;
		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._version = version;

	}

}