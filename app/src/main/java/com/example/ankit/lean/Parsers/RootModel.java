import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String organizer_description;
	public String location_name;
	public String description;
	public String name;
	public CopyrightModel _copyright;
	public String background_image;
	public String schedule_published_on;
	public String state;
	public int id;
	public String start_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String end_time;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String organizer_description, String location_name, String description, String name, CopyrightModel copyright, String background_image, String schedule_published_on, String state, int id, String start_time, String email, Call_for_papersModel call_for_papers, String topic, String end_time, String timezone, String organizer_name, String code_of_conduct, String logo, String privacy, ArrayList<Social_linksModel> social_links, String type, VersionModel version) {

		this._creator = creator;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.description = description;
		this.name = name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.id = id;
		this.start_time = start_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.privacy = privacy;
		this.social_links = social_links;
		this.type = type;
		this._version = version;

	}

}