import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String privacy;
	public String state;
	public String description;
	public String type;
	public String background_image;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String name;
	public String email;
	public String logo;
	public String organizer_description;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String code_of_conduct;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String location_name;
	public String topic;
	public String start_time;

	public RootModel(VersionModel version, String privacy, String state, String description, String type, String background_image, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_name, String name, String email, String logo, String organizer_description, String schedule_published_on, ArrayList<Social_linksModel> social_links, int id, String code_of_conduct, String end_time, CopyrightModel copyright, String timezone, String location_name, String topic, String start_time) {

		this._version = version;
		this.privacy = privacy;
		this.state = state;
		this.description = description;
		this.type = type;
		this.background_image = background_image;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.name = name;
		this.email = email;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.location_name = location_name;
		this.topic = topic;
		this.start_time = start_time;

	}

}