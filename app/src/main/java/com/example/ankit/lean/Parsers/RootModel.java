import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String email;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String background_image;
	public String description;
	public String location_name;
	public String end_time;
	public String start_time;
	public String topic;
	public String code_of_conduct;
	public String name;
	public String state;
	public String organizer_description;
	public String schedule_published_on;
	public String timezone;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String logo;
	public int id;
	public String privacy;

	public RootModel(CreatorModel creator, String email, String organizer_name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String background_image, String description, String location_name, String end_time, String start_time, String topic, String code_of_conduct, String name, String state, String organizer_description, String schedule_published_on, String timezone, VersionModel version, Call_for_papersModel call_for_papers, String type, String logo, int id, String privacy) {

		this._creator = creator;
		this.email = email;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._copyright = copyright;
		this.background_image = background_image;
		this.description = description;
		this.location_name = location_name;
		this.end_time = end_time;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.state = state;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this.privacy = privacy;

	}

}