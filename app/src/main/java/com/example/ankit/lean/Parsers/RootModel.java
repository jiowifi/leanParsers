import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String timezone;
	public String privacy;
	public String organizer_description;
	public String email;
	public CopyrightModel _copyright;
	public String start_time;
	public int id;
	public String location_name;
	public String name;
	public String code_of_conduct;
	public String background_image;
	public String state;
	public String topic;
	public String end_time;
	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, VersionModel version, String description, Call_for_papersModel call_for_papers, String logo, String timezone, String privacy, String organizer_description, String email, CopyrightModel copyright, String start_time, int id, String location_name, String name, String code_of_conduct, String background_image, String state, String topic, String end_time, CreatorModel creator, String type, String schedule_published_on) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._version = version;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.timezone = timezone;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.email = email;
		this._copyright = copyright;
		this.start_time = start_time;
		this.id = id;
		this.location_name = location_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.state = state;
		this.topic = topic;
		this.end_time = end_time;
		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;

	}

}