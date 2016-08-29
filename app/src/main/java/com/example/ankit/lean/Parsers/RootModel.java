import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String code_of_conduct;
	public String name;
	public String end_time;
	public int id;
	public String logo;
	public String privacy;
	public String type;
	public String location_name;
	public String state;
	public String background_image;
	public String timezone;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String topic;

	public RootModel(VersionModel version, String code_of_conduct, String name, String end_time, int id, String logo, String privacy, String type, String location_name, String state, String background_image, String timezone, String start_time, Call_for_papersModel call_for_papers, CreatorModel creator, String description, String schedule_published_on, CopyrightModel copyright, String organizer_description, String email, ArrayList<Social_linksModel> social_links, String organizer_name, String topic) {

		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.end_time = end_time;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this.type = type;
		this.location_name = location_name;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.email = email;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.topic = topic;

	}

}