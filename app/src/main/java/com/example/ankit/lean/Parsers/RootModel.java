import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String type;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String location_name;
	public String organizer_name;
	public String description;
	public String start_time;
	public String end_time;
	public String name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String state;
	public String email;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String background_image;
	public CopyrightModel _copyright;
	public int id;
	public VersionModel _version;

	public RootModel(String organizer_description, String type, String timezone, ArrayList<Social_linksModel> social_links, String logo, String location_name, String organizer_name, String description, String start_time, String end_time, String name, String code_of_conduct, CreatorModel creator, String schedule_published_on, String state, String email, String topic, Call_for_papersModel call_for_papers, String privacy, String background_image, CopyrightModel copyright, int id, VersionModel version) {

		this.organizer_description = organizer_description;
		this.type = type;
		this.timezone = timezone;
		this.social_links = social_links;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.email = email;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.background_image = background_image;
		this._copyright = copyright;
		this.id = id;
		this._version = version;

	}

}