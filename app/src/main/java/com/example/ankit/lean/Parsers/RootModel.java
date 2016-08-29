import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CreatorModel _creator;
	public int id;
	public String description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public String name;
	public String logo;
	public String state;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public String type;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String privacy;
	public String topic;
	public String code_of_conduct;

	public RootModel(String schedule_published_on, String email, Call_for_papersModel call_for_papers, String timezone, CreatorModel creator, int id, String description, String start_time, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, String name, String logo, String state, String organizer_description, String end_time, String background_image, String type, VersionModel version, CopyrightModel copyright, String privacy, String topic, String code_of_conduct) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._creator = creator;
		this.id = id;
		this.description = description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.name = name;
		this.logo = logo;
		this.state = state;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.type = type;
		this._version = version;
		this._copyright = copyright;
		this.privacy = privacy;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;

	}

}